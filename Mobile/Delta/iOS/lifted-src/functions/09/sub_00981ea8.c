/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x981ea8..0x982148 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_981ea8_4 {
    long long field_0;
    long long field_8;
} st_981ea8_4;

typedef struct st_981ea8_3 {
    struct st_981ea8_4 *field_0;
    char padding_8[48];
    long long field_38;
    char padding_40[64];
    long long field_80;
    char padding_88[24];
    long long field_a0;
} st_981ea8_3;

typedef struct st_981ea8_0 {
    char field_0[21];
    char field_d;
} st_981ea8_0;

extern char g_10002b0;

unsigned long long sub_981ea8(st_981ea8_3 *a0, long long a1, void* a2)
{
    unsigned int v27;  // w0
    long long v28;  // w0
    st_981ea8_0 *v29;  // x9
    unsigned long long v30;  // x0
    unsigned long v0;  // [bp-0x450]
    long long v1;  // [bp-0x448]
    char v2;  // [bp-0x440]
    char v3;  // [bp-0x438]
    uint128_t v4;  // [bp-0x400]
    uint128_t v5;  // [bp-0x3f0]
    uint128_t v6;  // [bp-0x3e0]
    uint128_t v7;  // [bp-0x3d0]
    uint128_t v8;  // [bp-0x3c0]
    uint512_t v9;  // [bp-0x3b0], Other Possible Types: char, unsigned int
    long long v10;  // [bp-0x3ac]
    unsigned long v11;  // [bp-0x378]
    uint128_t v12;  // [bp-0x370], Other Possible Types: unsigned long
    unsigned long v13;  // [bp-0x368]
    unsigned long v14;  // [bp-0x360]
    uint128_t v15;  // [bp-0x350]
    unsigned long v16;  // [bp-0x343]
    uint128_t v17;  // [bp-0x280]
    unsigned long v18;  // [bp-0x273]
    char *v19;  // [bp-0x80]
    char v20;  // [bp-0x78]
    long long v21;  // [bp-0x70]
    unsigned long v22;  // [bp-0x68]
    unsigned long v23;  // [bp-0x60]
    unsigned long v24;  // [bp-0x58]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v9 = _INSERT(CONCAT(v9, 0), 0, 0);
    *(uint128_t *)((char *)&v9 + 16) = 0;
    *(uint128_t *)((char *)&v9 + 32) = 0;
    *(uint128_t *)((char *)&v9 + 48) = 0;
    v12 = 0;
    v14 = 0;
    *(int128_t *)((char *)&v9 + 8) = (int128_t)a2[29];
    *(long long *)((char *)&v9 + 21) = (long long)a2[42];
    if (sub_980c6c(a0->field_80, (char *)&v9 + 29))
    {
        v7 = 0;
        v8 = 0;
        v5 = 0;
        v6 = 0;
        v4 = 0;
        v17 = (int128_t)a2[8];
        v18 = (long long)a2[21];
        v15 = *(uint128_t *)((void*)&v9 + 29);
        v16 = *(unsigned long long *)((void*)&v9 + 42);
        if (sub_9828cc(a1, &v17, &v15, &v4, 1) && sub_982994(&v4, &v17, &v1))
        {
            v27 = sub_a50734(a0->field_a0);
            if (v27)
            {
                v28 = (unsigned int)sub_a4fbf0(a0->field_a0);
                if (v28 >= 1)
                {
                    v0 = v1 + v27 + v28 + 16;
                    if (197 >= v0 && sub_982ad4(a0, &v17, v1, &v15, &v0) && v0 >= 16)
                    {
                        v29 = &v9 | 8;
                        *(long long *)&v29->field_0[13] = (long long)a2[42];
                        *(int128_t *)&v29->field_0[0] = (int128_t)a2[29];
                        v9 = *(unsigned int *)&v9 & 0xffffff00 | 32772;
                        v10 = 1;
                        v13 = v0;
                        v14 = &v15;
                        if (sub_991618(a0->field_0->field_0, a0->field_0->field_8, &v9, a2 + 8, (char *)&v14 + v13))
                        {
                            v11 = v14;
                            v12 = v13;
                            v19 = &v17;
                            v21 = a1;
                            v22 = 0;
                            v23 = 0;
                            if (sub_c68800(&v3, &v17, 0x200, 0) && sub_c639ec(&v3, (char)a2[8], &v9, 0) && sub_c68eb8(&v3, &v20) && sub_a6eaf8(&v3) && !sub_9d427c(a0->field_38, &v19, 40, 1, 0, &v2))
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/quic/quic_port.c", 1207, "port_send_retry");
                                sub_a36abc(20, 387, "port retry send failed due to network BIO I/O error");
                            }
                        }
                    }
                }
            }
        }
    }
    v30 = sub_a6c2e4(*(unsigned long long *)&v8, "ssl/quic/quic_port.c", 854);
    if (*(long long *)&g_10002b0 == v24)
        return v30;
    ___stack_chk_fail();
}
