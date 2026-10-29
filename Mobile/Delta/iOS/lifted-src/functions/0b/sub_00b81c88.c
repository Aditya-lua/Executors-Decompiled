/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb81c88..0xb81de8 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b7a7fc;
extern unsigned long long g_b7fa48;
extern unsigned long long g_b942a0;
extern long long g_cb8bd0;

unsigned long long sub_b81c88(void* *a0, long long *a1)
{
    void* v8;  // x21
    void* v9;  // x8
    void* v10;  // x9
    void* v11;  // x21
    unsigned long long v12;  // x10
    unsigned long long v13;  // x0
    char v0;  // [bp-0x68]
    long long v1;  // [bp-0x60]
    void* v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = *a0;
    v9 = v8;
    v10 = *(long long *)v8;
    v11 = v8 + 8;
    v12 = *(long long *)v10;
    if (v12 != 8)
    {
        if (v12 == 9 && (char)v10[24] != 5)
        {
LABEL_b81d04:
            v2 = v9;
            v3 = &g_b942a0;
            goto LABEL_b81d5c;
        }
        else if (*(char *)v11 == 1)
        {
            switch (v12)
            {
            case 6:
                if ((long long)v10[8] == 9223372036854775810 && 0x7fefffffffffffff >= ((long long)v10[16] & 0x7fffffffffffffff) && (long long)v10[16] < 0)
                    goto LABEL_b81d04;
                break;
            case 8:
LABEL_b81cf8:
                if ((char)v10[16] == 1)
                    goto LABEL_b81d04;
                break;
            default:
                break;
            }
        }
    }
    else
    {
        if (*(char *)v11 == 1)
            goto LABEL_b81cf8;
    }
    v2 = v9;
    v3 = &g_b942a0;
LABEL_b81d5c:
    sub_b71ea8(&v0);
    v2 = v11;
    v3 = &g_b7fa48;
    v4 = &v0;
    v5 = &g_b7a7fc;
    v13 = sub_be769c(*a1, a1[1], &g_cb8bd0, &v2);
    if (!v0)
        return v13;
    _free(v1);
    return v13;
}
