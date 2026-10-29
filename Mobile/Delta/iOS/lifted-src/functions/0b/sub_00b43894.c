/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43894..0xb439bc (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43894_0 {
    struct st_b43894_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b43894_0;


st_b43894_0 * sub_b43894(long long *a0, st_b43894_0 *a1)
{
    long long v2;  // x0
    st_b43894_0 *v3;  // x0
    st_b43894_0 *v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
    st_b43894_0 *v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec(*a0);
    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        if (sub_a6fbc4(a1, "cipher"))
        {
            v3 = sub_afde7c(a0 + 2, a1, v2);
            if (!(unsigned int)v3)
                return v3;
            if (sub_a4fdf4(sub_954340(a0 + 2)) == 2)
                goto LABEL_b43904;
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/cmac_prov.c", 267, "cmac_set_ctx_params");
            sub_a36abc(57, 125, 0);
        }
        else
        {
LABEL_b43904:
            v4 = sub_a6fbc4(a1, "key");
            if (!v4)
            {
                return 1;
            }
            else if (v4->field_8 == 5)
            {
                v5 = sub_954340(a0 + 2);
                v6 = sub_c4ba8(a0 + 2);
                v7 = sub_9f21e0(a0[1], v4->field_10, v4->field_18, v5, v6, 0);
                sub_afdddc(a0 + 2);
                return v7;
            }
        }
        return 0;
    }
    else
    {
        return 1;
    }
}
