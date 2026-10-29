/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadd398..0xadd54c (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_add398_0 {
    struct st_add398_0 *field_0;
    long long field_8;
    struct st_add398_0 *field_10;
} st_add398_0;


int sub_add398(long long a0, unsigned int a1, st_add398_0 *a2, unsigned long a3, unsigned long a4, long long a5, st_add398_0 *a6)
{
    st_add398_0 *v5;  // x20
    st_add398_0 *v6;  // x0
    st_add398_0 *v7;  // x19
    st_add398_0 *v8;  // x0
    st_add398_0 *v0;  // [bp-0x58]
    long long v1;  // [bp-0x50]
    st_add398_0 *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a1 == 4)
    {
        v0 = a2;
        v1 = a5;
        v2 = a6;
        v6 = sub_add5a8();
    }
    else if (a1 != 3)
    {
LABEL_add530:
        v6 = 0;
    }
    else if (a2)
    {
        v5 = sub_c4ba8();
        v6 = sub_a6bffc(24, "crypto/x509/by_store.c", 132);
        if (!v6)
            return (unsigned int)v6;
        v7 = v6;
        v7->field_0 = sub_a6d9b4(a2, "crypto/x509/by_store.c", 139);
        v7->field_8 = a5;
        if (a6)
        {
            v7->field_10 = sub_a6d9b4(a6, "crypto/x509/by_store.c", 142);
LABEL_add4f4:
            sub_ad763c();
        }
        else
        {
            if (!sub_ad6b74(a2, a5, 0, 0, 0, 0, 0, 0) || !v7->field_0)
                goto LABEL_add4f4;
            sub_ad763c();
            if (!v5)
            {
                v8 = sub_ad61b4();
                if (v8)
                {
                    v5 = v8;
                    sub_a356c4(a0, v5);
                    goto LABEL_add4d8;
                }
            }
            else
            {
LABEL_add4d8:
                if ((int)sub_ad68a0(v5, v7) > 0)
                    goto LABEL_add4ec;
            }
        }
        sub_a6c2e4(v7->field_0, "crypto/x509/by_store.c", 112);
        sub_a6c2e4(v7->field_10, "crypto/x509/by_store.c", 113);
        sub_a6c2e4(v7, "crypto/x509/by_store.c", 114);
        goto LABEL_add530;
    }
    else
    {
LABEL_add4ec:
        v6 = 1;
    }
    return (unsigned int)v6;
}
