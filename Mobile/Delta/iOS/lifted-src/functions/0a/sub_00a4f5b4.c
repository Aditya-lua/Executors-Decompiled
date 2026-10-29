/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f5b4..0xa4f864 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4f5b4_0 {
    struct st_a4f5b4_0 *field_0;
} st_a4f5b4_0;

extern char g_10002b0;

st_a4f5b4_0 ** sub_a4f5b4(long long a0, long long a1, st_a4f5b4_0 **a2, st_a4f5b4_0 **a3, int a4, st_a4f5b4_0 **a5, st_a4f5b4_0 **a6, st_a4f5b4_0 **a7)
{
    st_a4f5b4_0 **iter;  // x21
    st_a4f5b4_0 **node;  // x23
    st_a4f5b4_0 **v16;  // w20
    unsigned long long v17;  // x9
    st_a4f5b4_0 **v18;  // x8
    st_a4f5b4_0 **v19;  // w28
    st_a4f5b4_0 **i;  // w28
    st_a4f5b4_0 **v8;  // x27
    unsigned long long v9;  // x0
    st_a4f5b4_0 **v10;  // w28
    st_a4f5b4_0 **v11;  // x19
    st_a4f5b4_0 **v12;  // x2
    st_a4f5b4_0 **v13;  // w25
    st_a4f5b4_0 **v14;  // x20
    st_a4f5b4_0 **v15;  // w20
    st_a4f5b4_0 **v0;  // [bp-0xc4]
    st_a4f5b4_0 **v1;  // [bp-0xac]
    char v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    iter = a7;
    node = a6;
    v3 = *(long long *)&g_10002b0;
    v1 = (st_a4f5b4_0 **)0;
    v8 = sub_9e4290();
    v9 = sub_a50728(a0);
    if (65 > (int)(unsigned int)v8)
    {
        v10 = (st_a4f5b4_0 **)(unsigned int)v9;
        if (0x11 <= (unsigned int)v9)
            goto LABEL_a4f848;
        if (a3)
        {
            v11 = sub_a3f728();
            v12 = a2;
            if (v11)
            {
                v13 = (st_a4f5b4_0 **)0;
                v0 = (char *)a5 - 1;
                v14 = a2;
            }
            else
            {
LABEL_a4f7cc:
                v8 = 0;
                goto LABEL_a4f7d0;
            }
            do
            {
                v12 = 0;
                if (!sub_a3fe04(v11, a1, 0) || v13 && !(v12 = v1, sub_a3fe10(v11, &v2, v12)) || !(v12 = a4, sub_a3fe10(v11, a3, v12) && (!v14 || (v12 = 8, sub_a3fe10(v11, v14, 8))) && (v12 = &v1, sub_a3ff7c(v11, &v2, &v1))))
                    goto LABEL_a4f7cc;
                v15 = v0;
                if (a5 >= 2)
                {
                    do
                    {
                        v16 = v15;
                        v12 = 0;
                        if (!sub_a3fe04(v11, a1, 0) || !(v12 = v1, sub_a3fe10(v11, &v2, v12) && (v12 = &v1, sub_a3ff7c(v11, &v2, &v1))))
                            goto LABEL_a4f7cc;
                    } while ((v15 = (char *)v16 - 1, v16 != 1));
                    goto LABEL_a4f718;
                    goto LABEL_a4f7cc;
                }
LABEL_a4f718:
                v17 = v8 & 0xffffffff;
                if ((unsigned int)v17)
                {
                    v18 = 0;
                    v14 = a2;
                    do
                    {
                        if (v18 == v1)
                        {
                            v8 = v17 - (char *)v18;
                            if (!v10)
                                goto LABEL_a4f794;
                            goto LABEL_a4f788;
                        }
                        if (node)
                        {
                            *(char *)node = *(char *)(&v2 + v18);
                            node = (char *)node + 1;
                        }
                        v18 = (char *)v18 + 1;
                    } while ((unsigned int)v17 != (unsigned int)v18);
                    v8 = 0;
                    v18 = v17;
                    if (!v10)
                        goto LABEL_a4f794;
                }
                else
                {
                    v8 = 0;
                    v18 = 0;
                    v14 = a2;
                    if (!v10)
                        goto LABEL_a4f794;
                }
LABEL_a4f788:
                v19 = v10;
                if ((unsigned int)v18 != v1)
                {
                    do
                    {
                        i = v19;
                        v10 = i;
                        if ((unsigned int)v18 == v1)
                            break;
                        if (iter)
                        {
                            *(char *)iter = (&v2)[v18 & 0xffffffff];
                            iter = (char *)iter + 1;
                        }
                        v18 = (unsigned int)v18 + 1;
                        v10 = (char *)i - 1;
                        v19 = v10;
                    } while (i != 1);
                }
LABEL_a4f794:
                v13 = (char *)v13 + 1;
            } while ((unsigned int)v8 || v10);
            v8 = sub_9e4290(a0);
LABEL_a4f7d0:
            sub_a3f73c(v11);
            a1 = 64;
            v9 = sub_a66ec0(&v2, 64);
            a2 = v12;
        }
        if (*(long long *)&g_10002b0 == v3)
            return v8;
    }
    else
    {
        sub_a69928("assertion failed: nkey <= EVP_MAX_KEY_LENGTH", "crypto/evp/evp_key.c", 92);
LABEL_a4f848:
        a1 = "crypto/evp/evp_key.c";
        a2 = 93;
        v9 = sub_a69928("assertion failed: niv >= 0 && niv <= EVP_MAX_IV_LENGTH", "crypto/evp/evp_key.c", 93);
    }
    ___stack_chk_fail(v9, a1, a2);
}
