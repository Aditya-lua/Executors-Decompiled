/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3371c..0x33968 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3371c_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
} st_3371c_0;


double sub_3371c(unsigned long a0)
{
    st_3371c_0 *ptr;  // x8
    unsigned long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if (sub_1935c(&v0, "pi"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 4614256656552045848;
        return 0;
    }
    else if (sub_1935c(&v0, "huge"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 0x7ff0000000000000;
        return 0;
    }
    else if (sub_1935c(&v0, "nan"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 0x7ff8000000000000;
        return 0;
    }
    else if (sub_1935c(&v0, "e"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 4613303445314885481;
        return 0;
    }
    else if (sub_1935c(&v0, "phi"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 0x3ff9e3779b97f4a8;
        return 0;
    }
    else if (sub_1935c(&v0, "sqrt2"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 0x3ff6a09e667f3bcd;
        return 0;
    }
    else if (sub_1935c(&v0, "tau"))
    {
        ptr->field_0 = 3;
        memset(&ptr->field_4, 0, 36);
        ptr->field_8 = 4618760256179416344;
        return 0;
    }
    else
    {
        memset(ptr, 0, 40);
        return 0;
    }
}
