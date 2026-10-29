/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96f58..0xa97298 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96f58_0 {
    char field_0;
    char padding_1[15];
    char field_10;
    char padding_11[14];
    char field_1f;
} st_a96f58_0;


unsigned long long sub_a96f58(void* a0, uint128_t *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v4;  // x26
    unsigned long long v5;  // x25
    unsigned long long v14;  // x27
    st_a96f58_0 *v15;  // x24
    unsigned long long v16;  // x8
    unsigned long long v17;  // x27
    unsigned long long v18;  // w9
    unsigned long long v19;  // w9
    unsigned long long v20;  // x8
    unsigned long long v23;  // x23
    unsigned long long v6;  // x8
    unsigned long long v24;  // x8
    unsigned long long v25;  // x8
    unsigned long long v26;  // x0
    unsigned long long j;  // x28
    unsigned long long v28;  // x23
    unsigned long long v29;  // x28
    st_a96f58_0 *v30;  // x24
    unsigned long long *v31;  // x8
    unsigned long long v32;  // x11
    unsigned long long v33;  // x9
    unsigned long long v7;  // x22
    unsigned long long v34;  // x8
    uint128_t v35;  // q0
    unsigned long long v8;  // x24
    unsigned long long i;  // x27
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x0
    unsigned long long v13;  // x28
    uint128_t v0;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (long long)a0[104];
    v5 = v4 + (a3 >> 4);
    if (a3 >= 16 && (long long)a0[32])
    {
        if (v5 >= 2)
        {
            if (!v5)
                v6 = 64;
            else
                v6 = Clz(v5);
            v7 = v6 ^ 63;
            v8 = (long long)a0[40];
            i = v7 - v8;
            if (v7 > v8)
            {
                v10 = (long long)a0[48];
                if (v7 >= v10)
                {
                    v11 = v10 + (v7 - v10 & 0xfffffffffffffffc) + 4;
                    *(unsigned long long *)&a0[48] = v11;
                    v12 = sub_a6c1b4((long long)a0[88], v11 * 16, "crypto/modes/ocb128.c", 113);
                    if (!v12)
                        return v12;
                    *(unsigned long long *)&a0[88] = v12;
                }
                v13 = v8 * 16;
                do
                {
                    v14 = i;
                    v15 = (long long)a0[88] + v13;
                    sub_a96bfc(v15, 1, &v15->field_10);
                    v15->field_1f = v15->field_0 >> 7 & 135 ^ v15->field_1f;
                    v13 += 16;
                    i = v14 - 1;
                } while (i);
                *(unsigned long long *)&a0[40] = v7;
            }
        }
        if ((long long)a0[88])
            (long long)a0[32]();
    }
    else
    {
        v16 = v4 + 1;
        if (v16 > v5)
        {
            if (a3 & 15)
            {
                *(int128_t *)&a0[144] = (int128_t)a0[144] ^ (int128_t)a0[56];
                (*(long long *)a0)();
            }
            *(unsigned long long *)&a0[104] = v5;
            return 1;
        }
        if (!(v4 & 1))
        {
            v17 = 0;
            goto LABEL_a97150;
        }
        else
        {
            v17 = 0;
            v18 = 1;
            do
            {
                v19 = v18;
                v20 = v16;
                v17 = (unsigned int)v17 + 1;
                v16 = v20 >> 1;
                v18 = v19 + 1;
            } while (!(v20 >> 1 & 1));
            v23 = (long long)a0[40];
            if (v17 <= v23)
                goto LABEL_a97150;
            v24 = (long long)a0[48];
            if (v17 >= v24)
            {
                v25 = v24 + (v17 - v24 & 0xfffffffffffffffc) + 4;
                *(unsigned long long *)&a0[48] = v25;
                v26 = sub_a6c1b4((long long)a0[88], v25 * 16, "crypto/modes/ocb128.c", 113);
                if (v26)
                {
                    *(unsigned long long *)&a0[88] = v26;
                    goto LABEL_a97104;
                }
            }
            else
            {
LABEL_a97104:
                j = v19 - v23;
                v28 = v23 * 16;
                do
                {
                    v29 = j;
                    v30 = (long long)a0[88] + v28;
                    sub_a96bfc(v30, 1, &v30->field_10);
                    v30->field_1f = v30->field_0 >> 7 & 135 ^ v30->field_1f;
                    v28 += 16;
                    j = v29 - 1;
                } while (j);
                *(unsigned long long *)&a0[40] = v17;
LABEL_a97150:
                if ((long long)a0[88])
                {
                    v31 = (long long)a0[88] + v17 * 16;
                    v32 = (long long)a0[152];
                    v33 = *v31 ^ (long long)a0[144];
                    *(unsigned long long *)&a0[144] = v33;
                    v34 = v31[1] ^ v32;
                    *(unsigned long long *)&a0[152] = v34;
                    v0 = *a1;
                    v35 = v0;
                    *(uint128_t *)&a0[160] = v35 ^ (int128_t)a0[160];
                    v0 = *(unsigned long long *)&*(unsigned long long *)(void*)&v35 ^ v33;
                    v1 = *(unsigned long long *)((void*)&v35 + 8) ^ v34;
                    (*(long long *)a0)();
                }
            }
        }
    }
    return 0;
}
