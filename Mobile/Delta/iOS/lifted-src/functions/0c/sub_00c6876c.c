/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6876c..0xc68800 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6876c_0 {
    char padding_0[16];
    unsigned long long field_10[2];
    char field_18;
    char padding_19[15];
    char field_28;
    char padding_29[7];
    char field_30;
} st_c6876c_0;


void sub_c6876c(st_c6876c_0 *a0, char a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char idx;  // x0
    char v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*(long long *)&a0->padding_19[7])
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!a1 || !(a0->field_28 & 1))
        {
            idx = sub_a6ee2c();
            if (idx)
            {
                *(long long *)idx = *(long long *)&a0->padding_19[7];
                *(unsigned long long *)&a0->padding_19[7] = idx;
                v9 = a0->field_10[1];
                *(unsigned long long *)(idx + 16) = a1;
                *(unsigned long long *)(idx + 24) = v9 + a1;
                if (!a1)
                {
                    *(unsigned long long *)(idx + 8) = 0;
                }
                else
                {
                    *(unsigned long long *)(idx + 8) = v9;
                    if (!sub_a6ee10())
                        goto LABEL_c687d4;
                    *(__m128i *)a0->field_10 = _mm_add_epi64(a0->field_10, CONCAT(a1, a1));
                }
            }
        }
LABEL_c687d4:
    }
}
