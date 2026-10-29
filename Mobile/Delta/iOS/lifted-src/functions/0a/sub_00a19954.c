/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19954..0xa199ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19954_2 {
    struct st_a19954_0 *field_0;
} st_a19954_2;

typedef struct st_a19954_1 {
    char padding_0[24];
    struct st_a19954_2 *field_18;
    char field_20;
    char padding_21[19];
    unsigned int field_34;
    char padding_38[40];
    unsigned long long field_60;
} st_a19954_1;

typedef struct st_a19954_0 {
    char field_0;
} st_a19954_0;


st_a19954_1 * sub_a19954(st_a19954_1 *a0, char *a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a19954_0 **v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_18;
    if (v12)
    {
        if (!*(long long *)&a0->field_20)
        {
            v12 = sub_a1a56c();
            *(st_a19954_0 ***)&a0->field_20 = v12;
            if (!v12)
                return v12;
        }
        v12 = sub_a1dafc();
        if ((unsigned int)v12)
        {
            a0->field_60 = a0->field_60 + 1;
            if (!((char)(*(char *)*(long long *)a0->field_18) >> 1 & 1))
                a0->field_34 = *a1 & 254;
            v12 = 1;
        }
    }
    return v12;
}
