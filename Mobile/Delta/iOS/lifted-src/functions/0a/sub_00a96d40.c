/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96d40..0xa96f58 (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96d40_0 {
    char field_0;
    char padding_1[15];
    char field_10;
    char padding_11[14];
    char field_1f;
} st_a96d40_0;


unsigned long long sub_a96d40(void* a0, uint128_t *a1, unsigned long long a2)
{
    unsigned long long v6;  // x25
    unsigned long long v7;  // x24
    unsigned long long v16;  // x8
    unsigned long long v17;  // x8
    unsigned long long v18;  // x0
    unsigned long long i;  // x27
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    st_a96d40_0 *v22;  // x23
    unsigned long long *v23;  // x8
    unsigned long long v24;  // x11
    unsigned long long v25;  // x9
    unsigned long long v8;  // x8
    unsigned long long v26;  // x8
    unsigned long long n;  // x21
    unsigned long long v9;  // x26
    unsigned long long v10;  // w9
    unsigned long long v11;  // w9
    unsigned long long v12;  // x8
    unsigned long long v15;  // x28
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = (long long)a0[96];
    v7 = v6 + (a2 >> 4);
    v8 = v6 + 1;
    if (v7 >= v8)
    {
        if (!(v6 & 1))
        {
            v9 = 0;
        }
        else
        {
            v9 = 0;
            v10 = 1;
            do
            {
                v11 = v10;
                v12 = v8;
                v9 = (unsigned int)v9 + 1;
                v8 = v12 >> 1;
                v10 = v11 + 1;
            } while (!(v12 >> 1 & 1));
            v15 = (long long)a0[40];
            if (v9 > v15)
            {
                v16 = (long long)a0[48];
                if (v9 >= v16)
                {
                    v17 = v16 + (v9 - v16 & 0xfffffffffffffffc) + 4;
                    *(unsigned long long *)&a0[48] = v17;
                    v18 = sub_a6c1b4((long long)a0[88], v17 * 16, "crypto/modes/ocb128.c", 113);
                    if (!v18)
                        return v18;
                    *(unsigned long long *)&a0[88] = v18;
                }
                i = v11 - v15;
                v20 = v15 * 16;
                do
                {
                    v21 = i;
                    v22 = (long long)a0[88] + v20;
                    sub_a96bfc(v22, 1, &v22->field_10);
                    v22->field_1f = v22->field_0 >> 7 & 135 ^ v22->field_1f;
                    v20 += 16;
                    i = v21 - 1;
                } while (i);
                *(unsigned long long *)&a0[40] = v9;
            }
        }
        if (!(long long)a0[88])
            return 0;
        v23 = (long long)a0[88] + v9 * 16;
        v24 = (long long)a0[120];
        v25 = *v23 ^ (long long)a0[112];
        *(unsigned long long *)&a0[112] = v25;
        v26 = v23[1] ^ v24;
        *(unsigned long long *)&a0[120] = v26;
        v1 = *a1;
        v2 = *(unsigned long long *)&v1 ^ v25;
        v3 = *(unsigned long long *)((void*)&v1 + 8) ^ v26;
        (*(long long *)a0)();
    }
    else
    {
        n = a2 & 15;
        if (!(a2 & 15))
        {
            *(unsigned long long *)&a0[96] = v7;
            return 1;
        }
        v0 = (int128_t)a0[112] ^ (int128_t)a0[56];
        *(uint128_t *)&a0[112] = v0;
        v1 = 0;
        ___memcpy_chk(&v1, a1, n, 16);
        *(char *)(&v1 | n) = 128;
        v1 ^= v0;
        (*(long long *)a0)();
    }
}
