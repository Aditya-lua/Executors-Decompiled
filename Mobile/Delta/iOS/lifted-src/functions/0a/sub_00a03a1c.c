/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03a1c..0xa03b70 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03a1c_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[4];
    unsigned int field_14;
    char padding_18[40];
    long long field_40;
} st_a03a1c_0;


unsigned int sub_a03a1c(st_a03a1c_0 *a0)
{
    long long v4;  // x19
    unsigned int *v5;  // x0
    unsigned int ptr;  // x0
    long long v7;  // x21
    unsigned int *v8;  // x0
    unsigned int v9;  // x2
    long long v10;  // x1
    long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a04658();
    v5 = ___error(v4, 0);
    if (v4)
    {
        ptr = _dlopen();
        if (ptr)
        {
            v7 = ptr;
            v8 = ___error();
            *v8 = *v5;
            if (sub_ad68a0(a0->field_8, v7))
            {
                a0->field_40 = v4;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/dso/dso_dlfcn.c", 125, "dlfcn_load");
            sub_a36abc(37, 105, 0);
            sub_a6c2e4(v4, "crypto/dso/dso_dlfcn.c", 133);
            _dlclose(v7);
        }
        else
        {
            sub_a368c8();
            v0 = v4;
            v1 = _dlerror(sub_a369bc("crypto/dso/dso_dlfcn.c", 115, "dlfcn_load"), 115, "dlfcn_load");
            v9 = (unsigned int)"filename(%s): %s";
            v10 = 103;
LABEL_a03af4:
            sub_a36abc(37, v10, v9);
            sub_a6c2e4(v4, "crypto/dso/dso_dlfcn.c", 133);
        }
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/dso/dso_dlfcn.c", 0x66, "dlfcn_load");
    v10 = 111;
    v9 = 0;
    goto LABEL_a03af4;
}
