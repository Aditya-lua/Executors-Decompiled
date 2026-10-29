/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54750..0xa54814 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a54750(void* a0, void* a1)
{
    unsigned long v2;  // x21
    unsigned long v3;  // x0
    unsigned int v4;  // w0
    unsigned long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a1[8];
    if (!v2)
    {
        v3 = sub_a55934(*(long long *)a1);
        *(unsigned long *)&a1[8] = v3;
        if (!v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/keymgmt_lib.c", 37, "evp_keymgmt_util_try_import");
            sub_a36abc(6, 0x80006, 0);
            return 0;
        }
    }
    if (!*(long long *)a0)
        return 1;
    v4 = sub_a55bfc(*(long long *)a1);
    v5 = v4 != 0;
    if (v2)
    {
        return v5;
    }
    else if (!v4)
    {
        sub_a55970(*(long long *)a1, (long long)a1[8]);
        *(unsigned long long *)&a1[8] = 0;
        return 0;
    }
    else
    {
        return v5;
    }
}
