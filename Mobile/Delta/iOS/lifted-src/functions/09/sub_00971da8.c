/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971da8..0x971e40 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971da8_0 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    char padding_38[8];
    unsigned long long field_40;
} st_971da8_0;


int sub_971da8(st_971da8_0 *a0)
{
    unsigned long v3;  // x8
    unsigned long v4;  // x20
    unsigned int v5;  // w0
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = a0->field_40;
    if (a0->field_40)
    {
        v4 = 0;
        do
        {
            v5 = sub_9d4248(a0->field_28, a0->field_30 + v4, v3 - v4, &v0);
            v3 = a0->field_40;
            if (!v5)
            {
                _memmove(a0->field_30, a0->field_30 + v4, v3 - v4);
                a0->field_40 = 0;
                return 0;
            }
        } while ((v4 += v0, v4 < v3));
    }
    a0->field_40 = 0;
    sub_9d46fc(a0->field_28, 11, 0, 0);
    return 1;
}
