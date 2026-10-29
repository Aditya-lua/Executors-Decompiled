/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9826e4..0x9828cc (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9826e4_0 {
    struct st_9826e4_1 *field_0;
    char padding_8[152];
    long long field_a0;
} st_9826e4_0;

typedef struct st_9826e4_3 {
    char field_0[21];
    char field_d;
} st_9826e4_3;

typedef struct st_9826e4_1 {
    long long field_0;
} st_9826e4_1;

typedef struct st_9826e4_2 {
    struct st_9826e4_0 *field_0;
    char padding_8[80];
    unsigned long long field_58;
    unsigned long long field_60;
    char padding_68[1040];
    char field_478[21];
    char field_485;
} st_9826e4_2;

extern char g_10002b0;

char sub_9826e4(st_9826e4_2 *a0, long long a1)
{
    char v14;  // x0
    char v15;  // x20
    st_9826e4_3 *v16;  // x8
    char v17;  // w0
    unsigned int v18;  // w0
    unsigned long v19;  // x0
    long long v20;  // x2
    char v0;  // [bp-0x1a8]
    uint128_t v1;  // [bp-0x1a0], Other Possible Types: unsigned long
    unsigned long v2;  // [bp-0x193]
    uint128_t v3;  // [bp-0x180]
    unsigned long v4;  // [bp-0x173]
    char v5;  // [bp-0xb0]
    char v6;  // [bp-0xa0]
    char v7;  // [bp-0x90]
    char v8;  // [bp-0x80]
    char v9;  // [bp-0x70]
    uint168_t v10;  // [bp-0x5d]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    *(unsigned long long *)((char *)&v10 + 9) = 0;
    *(unsigned long long *)((char *)&v10 + 1) = 0;
    *(unsigned int *)((char *)&v10 + 0x11) = 0;
    v0 = 0;
    v14 = (char)a0;
    if ((char)(*(char *)(v14 + 1571)) >> 1 & 1)
    {
        v14 = sub_a6bffc(197, "ssl/quic/quic_port.c", 1446);
        if (v14)
        {
            v15 = v14;
            *(char *)&v10 = 8;
            if (sub_aa8658(*(long long *)a0->field_0->field_0, (char *)&v10 + 1, 8, 0))
            {
                v8 = 0;
                v9 = 0;
                v6 = 0;
                v7 = 0;
                v5 = 0;
                v16 = a0->field_478;
                v3 = *(int128_t *)&v16->field_0[0];
                v4 = *(long long *)&v16->field_0[13];
                v1 = *(uint128_t *)&v10;
                v2 = *(unsigned long long *)((void*)&v10 + 13);
                if (sub_9828cc(a1, &v3, &v1, &v5, 0) && sub_982994(&v5, &v3, &v0) && !(v17 = sub_a50734(a0->field_0->field_a0), !v17 || (v18 = sub_a4fbf0(a0->field_0->field_a0), (int)v18 < 1 || (v1 = v0 + v17 + v18 + 16, 197 < v1 || !sub_982ad4(a0->field_0, &v3, v0, v15, &v1) || v1 <= 15))))
                {
                    a0->field_58 = v15;
                    a0->field_60 = v1;
                    v19 = *(unsigned long long *)&v9;
                }
                else
                {
                    sub_a6c2e4(v15, "ssl/quic/quic_port.c", 1472);
                    v19 = *(unsigned long long *)&v9;
                }
                v20 = 854;
            }
            else
            {
                v19 = v15;
                v20 = 1458;
            }
            v14 = sub_a6c2e4(v19, "ssl/quic/quic_port.c", v20);
        }
    }
    if (*(long long *)&g_10002b0 == v11)
        return v14;
    ___stack_chk_fail();
}
