/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03e64..0xa03f98 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a03e64(unsigned long a0, void* a1, void* a2)
{
    unsigned long long len;  // x21
    unsigned long long v3;  // x8
    unsigned int v4;  // w9
    unsigned long long v5;  // x11
    unsigned long v6;  // cc_dep1
    void* v7;  // w22
    unsigned long long v8;  // 4105
    unsigned long long v9;  // 4105
    void* v10;  // x0
    void* v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 && !a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 198, "dlfcn_merger");
        sub_a36abc(37, 0xc0102, 0);
        return 0;
    }
    if (!a2)
        return sub_a6d9b4(a1, "crypto/dso/dso_dlfcn.c", 206);
    if (!a1)
    {
        return sub_a6d9b4(a2, "crypto/dso/dso_dlfcn.c", 214);
    }
    else if (*(char *)a1 != 47)
    {
        len = _strlen(a2);
        v3 = _strlen(a1) + len;
        if ((unsigned int)len)
        {
            v4 = *((char *)a2 + len - 1);
            v5 = v3 - 1;
            v6 = v4 & 0xff;
            if (v4 != 47)
            {
                v7 = (void*)(unsigned int)len;
                v8 = arm64g_calculate_condition(19, v6, 47, 0);
                if (!(v8 & 1))
                    goto LABEL_a03f4a;
LABEL_a03f49:
            }
            else
            {
                v7 = (void*)(unsigned int)(len - 1);
                v9 = arm64g_calculate_condition(19, v6, 47, 0);
                if (v9 & 1)
                    goto LABEL_a03f49;
LABEL_a03f4a:
                v3 = v5;
            }
        }
        else
        {
            v7 = (void*)0;
        }
        v10 = sub_a6bf4c((unsigned int)v3 + 2, "crypto/dso/dso_dlfcn.c", 234);
        if (v10)
        {
            v11 = _strcpy() + (long long)v7;
            *(char *)v11 = 47;
            _strcpy(v11 + 1, a1);
            return v10;
        }
        return v10;
    }
    return sub_a6d9b4(a1, "crypto/dso/dso_dlfcn.c", 206);
}
