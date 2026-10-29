/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe73d8..0xbe7514 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be73d8_0 {
    char padding_0[16];
    long long field_10;
    unsigned long long field_18;
} st_be73d8_0;


void sub_be73d8(unsigned long long *a0)
{
    unsigned long long i;  // x20
    st_be73d8_0 *v3;  // x26
    unsigned long v4;  // x27
    unsigned long v5;  // x27
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != a0[3] - a0[1] >> 5)
    {
        v3 = a0[1] + i * 32;
        i += 1;
        v4 = v3->field_18 + 1;
        while (1)
        {
            v5 = v4 - 1;
            if (v4 == 1)
                break;
            sub_b9b19c();
            v4 = v5;
        }
        if (*(long long *)&v3->padding_0[8])
            _free(v3->field_10);
    }
    if (!a0[2])
        return;
    _free();
    return;
}
