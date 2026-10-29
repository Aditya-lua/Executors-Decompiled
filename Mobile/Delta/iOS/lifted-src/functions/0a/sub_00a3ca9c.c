/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ca9c..0xa3cbf0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ca9c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    unsigned int field_1c;
    unsigned long long field_20;
} st_a3ca9c_0;

extern unsigned int g_e92a88[4];

unsigned long long sub_a3ca9c(unsigned long long a0, long long a1, st_a3ca9c_0 *a2)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x8
    unsigned long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x21
    unsigned long long idx;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3bbe8();
    if ((int)v2 < 1)
        return v2;
    if ((unsigned int)a0 == 1 && a2->field_8 == 2 || (unsigned int)a0 == 8 && a2->field_8 == 1)
    {
        v3 = a2->field_1c;
        if (2 < (unsigned int)v3)
            return 0;
        v4 = *(long long *)&g_e92a88[2 + 4 * v3];
        a2->field_20 = v4;
        a2->field_1c = _strlen(v4);
    }
    v5 = sub_a3aef4(a0, a1, a2);
    if ((int)v5 < 1)
        return v5;
    if ((unsigned int)a0 != 7 || a2->field_8 != 2)
    {
        if ((unsigned int)a0 != 2)
        {
            return 1;
        }
        else if (a2->field_8 != 1)
        {
            return 1;
        }
    }
    v6 = a2->field_20;
    if (!_strcmp(v6, "EXTRACT_AND_EXPAND"))
    {
        idx = 0;
        if ((unsigned int)a0 != 2)
            goto LABEL_a3cba4;
    }
    else if (_strcmp(v6, "EXTRACT_ONLY"))
    {
        if (_strcmp(v6, "EXPAND_ONLY"))
            return 0;
        idx = 2;
        if ((unsigned int)a0 != 2)
            goto LABEL_a3cba4;
    }
    else
    {
        idx = 1;
        if ((unsigned int)a0 != 2)
        {
LABEL_a3cba4:
            a2->field_1c = g_e92a88[4 * idx];
        }
    }
    a2->field_20 = 0;
    return 1;
}
