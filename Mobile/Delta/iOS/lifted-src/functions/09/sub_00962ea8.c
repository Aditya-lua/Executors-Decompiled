/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962ea8..0x962ee4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962ea8_0 {
    char padding_0[152];
    unsigned int field_98;
} st_962ea8_0;

typedef struct st_962ea8_1 {
    unsigned int field_0;
    char padding_4[2172];
    struct st_962ea8_0 *field_880;
} st_962ea8_1;


unsigned long long sub_962ea8(st_962ea8_1 *a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = a0->field_0;
        if ((unsigned int)v2)
        {
            if (!(v2 >> 7 & 1))
                return 0;
            a0 = sub_980dc8();
            if (a0)
                goto LABEL_962ed4;
        }
        else
        {
LABEL_962ed4:
            a0 = a0->field_880->field_98;
        }
    }
    return (unsigned int)a0;
}
