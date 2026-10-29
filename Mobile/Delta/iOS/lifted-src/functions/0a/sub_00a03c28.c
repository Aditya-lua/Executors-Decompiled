/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03c28..0xa03d4c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03c28_0 {
    char padding_0[8];
    long long field_8;
} st_a03c28_0;


int sub_a03c28(st_a03c28_0 *a0, st_a03c28_0 *a1)
{
    unsigned int v4;  // w0
    st_a03c28_0 *ptr;  // x0
    st_a03c28_0 *v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 171, "dlfcn_bind_func");
    }
    else if ((int)sub_ad69e4(a0->field_8) > 0)
    {
        v4 = sub_ad69e4(a0->field_8);
        if (sub_ad69f8(a0->field_8, v4 - 1))
        {
            ptr = _dlsym();
            if (ptr)
                return (unsigned int)ptr;
            sub_a368c8();
            v0 = a1;
            v1 = _dlerror(sub_a369bc("crypto/dso/dso_dlfcn.c", 185, "dlfcn_bind_func"), 185, "dlfcn_bind_func");
            sub_a36abc();
            return 0;
        }
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 180, "dlfcn_bind_func");
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_dlfcn.c", 175, "dlfcn_bind_func");
    }
    sub_a36abc();
    return 0;
}
