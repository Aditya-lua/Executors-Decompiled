/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53ccc..0xc53d7c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c53ccc_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c53ccc_0;


unsigned long long sub_c53ccc(st_c53ccc_0 *a0)
{
    unsigned long long v2;  // x19
    unsigned long v3;  // x22
    unsigned long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_8)
        _free(a0->field_0);
    v2 = a0->field_10;
    v3 = a0->field_18 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 560;
        sub_c54250();
        v3 = v4;
    }
    if (!a0->field_18)
        return v2;
    return _free();
}
