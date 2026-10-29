/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68684..0xc6876c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68684_1 {
    char padding_0[8];
    struct st_c68684_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    char field_30;
} st_c68684_1;

typedef struct st_c68684_0 {
    char padding_0[8];
    char field_8;
} st_c68684_0;


void sub_c68684(st_c68684_1 *a0, char a1, char a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char v12;  // x20
    char v13;  // x9
    st_c68684_0 *iter;  // x8
    unsigned long long v15;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a1 && a0->padding_28)
    {
        v12 = a1;
        if (a1 <= a0->field_20 - a0->field_18)
        {
            if (a0->padding_0 && !(v13 = *(long long *)a0->padding_0, v12 <= v13 - a0->field_18))
            {
                if (v12 >= v13)
                    v13 = v12;
                if (!sub_9ebd68())
                    goto LABEL_c68764;
            }
            if (a2)
            {
                iter = a0->field_8;
                if (a0->field_8 || !(iter = (st_c68684_0 *)a0->padding_0, !iter || (iter = *(long long *)&iter->field_8, !iter)))
                {
                    if (!(a0->field_30 & 1))
                        v15 = &iter->padding_0[a0->field_10];
                    else
                        v15 = &iter->padding_0[a0->field_20 + -1 * a0->field_10];
                    *(unsigned long long *)a2 = v15;
                    if (!(a0->field_30 & 1))
                        goto LABEL_c68760;
                    iter = v15 - v12;
                }
                *(st_c68684_0 **)a2 = iter;
            }
LABEL_c68760:
        }
    }
LABEL_c68764:
}
