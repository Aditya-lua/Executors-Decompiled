/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa97298..0xa975dc (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a97298_0 {
    char field_0;
    char padding_1[15];
    char field_10;
    char padding_11[14];
    char field_1f;
} st_a97298_0;


unsigned long long sub_a97298(void* a0, uint128_t *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v6;  // x26
    unsigned long long v7;  // x25
    unsigned long long v16;  // x27
    st_a97298_0 *v17;  // x24
    unsigned long long v18;  // x8
    unsigned long long v19;  // x27
    unsigned long long v20;  // w9
    unsigned long long v21;  // w9
    unsigned long long v22;  // x8
    unsigned long long v25;  // x23
    unsigned long long v8;  // x8
    unsigned long long v26;  // x8
    unsigned long long v27;  // x8
    unsigned long long v28;  // x0
    unsigned long long j;  // x28
    unsigned long long v30;  // x23
    unsigned long long v31;  // x28
    st_a97298_0 *v32;  // x24
    unsigned long long *v33;  // x8
    unsigned long long v34;  // x11
    unsigned long long v35;  // x9
    unsigned long long v9;  // x26
    unsigned long long v36;  // x8
    unsigned long long v10;  // x24
    unsigned long long i;  // x27
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    unsigned long long v14;  // x0
    unsigned long long v15;  // x28
    unsigned long long v0;  // [bp-0x78]
    uint128_t v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = (long long)a0[104];
    v7 = v6 + (a3 >> 4);
    if (a3 >= 16 && (long long)a0[32])
    {
        if (v7 >= 2)
        {
            if (!v7)
                v8 = 64;
            else
                v8 = Clz(v7);
            v9 = v8 ^ 63;
            v10 = (long long)a0[40];
            i = v9 - v10;
            if (v9 > v10)
            {
                v12 = (long long)a0[48];
                if (v9 >= v12)
                {
                    v13 = v12 + (v9 - v12 & 0xfffffffffffffffc) + 4;
                    *(unsigned long long *)&a0[48] = v13;
                    v14 = sub_a6c1b4((long long)a0[88], v13 * 16, "crypto/modes/ocb128.c", 113);
                    if (!v14)
                        return v14;
                    *(unsigned long long *)&a0[88] = v14;
                }
                v0 = v9;
                v15 = v10 * 16;
                do
                {
                    v16 = i;
                    v17 = (long long)a0[88] + v15;
                    sub_a96bfc(v17, 1, &v17->field_10);
                    v17->field_1f = v17->field_0 >> 7 & 135 ^ v17->field_1f;
                    v15 += 16;
                    i = v16 - 1;
                } while (i);
                *(unsigned long long *)&a0[40] = v0;
            }
        }
        if ((long long)a0[88])
            (long long)a0[32]();
    }
    else
    {
        v0 = a3;
        v18 = v6 + 1;
        if (v7 < v18)
        {
            if (v0 & 15)
            {
                *(int128_t *)&a0[144] = (int128_t)a0[144] ^ (int128_t)a0[56];
                (*(long long *)a0)();
            }
            *(unsigned long long *)&a0[104] = v7;
            return 1;
        }
        if (!(v6 & 1))
        {
            v19 = 0;
            goto LABEL_a974a8;
        }
        else
        {
            v19 = 0;
            v20 = 1;
            do
            {
                v21 = v20;
                v22 = v18;
                v19 = (unsigned int)v19 + 1;
                v18 = v22 >> 1;
                v20 = v21 + 1;
            } while (!(v22 >> 1 & 1));
            v25 = (long long)a0[40];
            if (v19 <= v25)
                goto LABEL_a974a8;
            v26 = (long long)a0[48];
            if (v19 >= v26)
            {
                v27 = v26 + (v19 - v26 & 0xfffffffffffffffc) + 4;
                *(unsigned long long *)&a0[48] = v27;
                v28 = sub_a6c1b4((long long)a0[88], v27 * 16, "crypto/modes/ocb128.c", 113);
                if (v28)
                {
                    *(unsigned long long *)&a0[88] = v28;
                    goto LABEL_a9745c;
                }
            }
            else
            {
LABEL_a9745c:
                j = v21 - v25;
                v30 = v25 * 16;
                do
                {
                    v31 = j;
                    v32 = (long long)a0[88] + v30;
                    sub_a96bfc(v32, 1, &v32->field_10);
                    v32->field_1f = v32->field_0 >> 7 & 135 ^ v32->field_1f;
                    v30 += 16;
                    j = v31 - 1;
                } while (j);
                *(unsigned long long *)&a0[40] = v19;
LABEL_a974a8:
                if ((long long)a0[88])
                {
                    v33 = (long long)a0[88] + v19 * 16;
                    v34 = (long long)a0[152];
                    v35 = *v33 ^ (long long)a0[144];
                    *(unsigned long long *)&a0[144] = v35;
                    v36 = v33[1] ^ v34;
                    *(unsigned long long *)&a0[152] = v36;
                    v1 = *a1;
                    v2 = *(unsigned long long *)&v1 ^ v35;
                    v3 = *(unsigned long long *)((void*)&v1 + 8) ^ v36;
                    (long long)a0[8]();
                }
            }
        }
    }
    return 0;
}
