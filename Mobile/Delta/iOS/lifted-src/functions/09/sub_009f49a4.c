/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f49a4..0x9f4a58 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9f49a4(long long a0, unsigned int *a1)
{
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6e200() && sub_a6e200(a0, "true"))
    {
        if (sub_a6e200(a0, "off") && sub_a6e200(a0, "false"))
        {
            sub_a368c8();
            sub_a369bc("crypto/conf/conf_def.c", 201, "parsebool");
            sub_a36abc(14, 122, 0);
            return 0;
        }
        v2 = 0;
    }
    else
    {
        v2 = 1;
    }
    *a1 = v2;
    return 1;
}
