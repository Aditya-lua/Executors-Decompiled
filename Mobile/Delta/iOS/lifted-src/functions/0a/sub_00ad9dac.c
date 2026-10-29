/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9dac..0xad9eec (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9dac_0 {
    struct st_ad9dac_0 *field_0;
    char padding_8[56];
    struct st_ad9dac_0 *field_40;
} st_ad9dac_0;


st_ad9dac_0 * sub_ad9dac(st_ad9dac_0 *a0, st_ad9dac_0 *a1, st_ad9dac_0 *a2)
{
    unsigned int v7;  // w21
    int v8;  // w8
    unsigned long v9;  // x21
    st_ad9dac_0 *v10;  // x0
    st_ad9dac_0 *v11;  // x22
    unsigned short v0;  // [bp-0x42]
    char v1[4];  // [bp-0x40]
    char v2[4];  // [bp-0x3c]
    char v3[3];  // [bp-0x38]
    unsigned int v4;  // [bp-0x35]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (a0 && a0->field_0 && a0->field_0->field_40)
        goto *((void *)(a0->field_0->field_40));
    v4 = 2126437;
    strncpy(v3, "Ente", 4);
    strcpy(v2, " ");
    strncpy(v1, " for", 4);
    v0 = 58;
    if (!a1)
        return 0;
    v7 = _strlen(a1);
    if (a2)
        v8 = v7 + _strlen(a2) + 11;
    else
        v8 = v7 + 6;
    v9 = v8 + 2;
    v10 = sub_a6bf4c(v9, "crypto/ui/ui_lib.c", 383);
    if (v10)
    {
        v11 = v10;
        sub_a6db20();
        sub_a6db94(v11, a1, v9);
        if (a2)
        {
            sub_a6db94(v11, v1, v9);
            sub_a6db94(v11, a2, v9);
        }
        sub_a6db94(v11, &v0, v9);
        return v11;
    }
    return 0;
}
