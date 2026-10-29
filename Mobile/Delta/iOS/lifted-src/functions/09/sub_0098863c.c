/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98863c..0x9887a0 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98863c_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char field_18;
} st_98863c_0;

typedef struct st_98863c_1 {
    char padding_0[8];
    char field_8;
} st_98863c_1;

extern char g_10002b0;

char sub_98863c(st_98863c_0 *a0, unsigned long long a1, unsigned long a2)
{
    char v5;  // x0
    char idx;  // x20
    unsigned long v7;  // x9
    st_98863c_1 *v8;  // x20
    char v9;  // x0
    char *v10;  // x0
    char v12;  // w0
    char v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!(a0->field_18 & 1) && !(v1 = a1, v5 = sub_a66b6c(a0->field_8, &v0), !v5))
    {
        idx = v5;
        v7 = *(long long *)(v5 + 24);
        if (*(long long *)(v5 + 24) != a2)
        {
            while (1)
            {
                v8 = (st_98863c_1 *)idx;
                if (v7 < a2 || !(idx = *(long long *)&v8->field_8, idx))
                    break;
                v7 = *(long long *)(idx + 24);
                if (*(long long *)(idx + 24) == a2)
                {
                    *(long long *)&v8->field_8 = *(long long *)(idx + 8);
                    goto LABEL_988718;
                }
            }
            goto LABEL_9886e0;
        }
        if (*(long long *)(idx + 8))
        {
            sub_a66794(a0->field_8, *(long long *)(idx + 8));
            if (sub_a66e38(a0->field_8))
                goto LABEL_98877c;
        }
        else
        {
            sub_a66994(a0->field_8, idx);
        }
LABEL_988718:
        v9 = sub_a66b6c(a0->field_10, idx);
        if (v9 != idx)
        {
            do
            {
                v10 = (char *)v9;
                v9 = *(long long *)v10;
            } while (*(long long *)v10 != idx);
            *(long long *)v10 = *(long long *)idx;
            goto LABEL_988744;
        }
        else if (*(long long *)idx)
        {
            sub_a66794(a0->field_10, *(long long *)idx);
            if (!sub_a66e38(a0->field_10))
                goto LABEL_988744;
LABEL_98877c:
            v12 = 0;
            a0->field_18 = a0->field_18 | 1;
        }
        else
        {
            sub_a66994(a0->field_10, idx);
LABEL_988744:
            sub_a6c2e4(idx, "ssl/quic/quic_srtm.c", 417);
            v12 = 1;
        }
    }
    else
    {
LABEL_9886e0:
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v12;
    ___stack_chk_fail();
}
