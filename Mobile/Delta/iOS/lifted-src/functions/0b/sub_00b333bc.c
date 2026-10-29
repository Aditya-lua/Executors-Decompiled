/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb333bc..0xb3347c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b333bc_0 {
    struct st_b333bc_0 *field_0;
} st_b333bc_0;

typedef struct st_b333bc_1 {
    char padding_0[96];
    struct st_b333bc_0 *field_60;
} st_b333bc_1;


unsigned long long sub_b333bc(st_b333bc_1 *a0, st_b333bc_0 **a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b333bc_0 **v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (*a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6fbc4(a1, "size");
        if (!v8)
            return 1;
        if ((int)a0->field_60)
        {
            v9 = sub_a70efc();
            if (!(unsigned int)v9)
                return v9;
        }
        else
        {
            if (sub_954340(&a0->padding_0[16]))
            {
                sub_a50ac8();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/sskdf.c", 388, "sskdf_size");
                sub_a36abc(57, 129, 0);
            }
            v10 = sub_a70efc(v8);
            if (!(unsigned int)v10)
                return v10;
        }
        return 1;
    }
    else
    {
        return 1;
    }
}
