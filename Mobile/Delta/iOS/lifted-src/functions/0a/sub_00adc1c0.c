/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc1c0..0xadc258 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc1c0_0 {
    char padding_0[16];
    long long field_10;
} st_adc1c0_0;


unsigned long long sub_adc1c0(st_adc1c0_0 *a0, unsigned int a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 != 2)
        return 0;
    if (a3 == 3)
    {
        v2 = sub_a6ac44(sub_af2688());
        if (!v2)
            v2 = sub_af2670();
        v3 = sub_adc778(a0->field_10, v2, 1);
        if ((unsigned int)v3)
            return v3;
        sub_a368c8();
        sub_a369bc("crypto/x509/by_dir.c", 99, "dir_ctrl");
        sub_a36abc(11, 103, 0);
    }
    else
    {
        return sub_adc778();
    }
    return 0;
}
