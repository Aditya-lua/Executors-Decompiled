/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7aa24..0xa7ab20 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7aa24_0 {
    char padding_0[80];
    long long field_50;
} st_a7aa24_0;


unsigned long long sub_a7aa24(st_a7aa24_0 *a0)
{
    long long *v2;  // x0
    long long *v3;  // x19
    unsigned long long v4;  // x0
    long long v5;  // w0
    long long *v6;  // x22
    st_a7aa24_0 **v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c(a0->field_50, 1);
    if (v2)
    {
        v3 = v2;
        v4 = sub_a7c198(v2[4]);
        if (!(unsigned int)v4)
            return v4;
        v5 = (unsigned int)sub_ad69e4(v3[2]);
        if (v5 >= 1)
        {
            v6 = 0;
            do
            {
                v7 = sub_ad69f8(v3[2], v6);
                if (*v7 == a0)
                {
                    sub_ad664c(v3[2], v6);
                    sub_a6c2e4(v7, "crypto/provider_core.c", 2224);
                    break;
                }
            } while ((v6 = (unsigned int)v6 + 1, v5 != (unsigned int)v6));
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
    }
}
