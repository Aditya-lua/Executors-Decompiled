/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4749c..0xb4771c (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4749c_1 {
    unsigned long long field_0;
    char padding_8[232];
    struct st_b4749c_0 *field_f0;
} st_b4749c_1;

typedef struct st_b4749c_0 {
    char padding_0[52];
    unsigned long long field_34;
    unsigned long long field_35;
    unsigned long long field_36;
    unsigned long long field_37;
    unsigned long long field_38;
    unsigned long long field_39;
    unsigned long long field_3a;
    unsigned long long field_3b;
    unsigned long long field_3c;
    unsigned long long field_3d;
    unsigned long long field_3e;
    unsigned long long field_3f;
    unsigned long long field_40;
    unsigned long long field_41;
    unsigned long long field_42;
    unsigned long long field_43;
    unsigned long long field_44;
    unsigned long long field_45;
    unsigned long long field_46;
    unsigned long long field_47;
    unsigned long long field_48;
    unsigned long long field_49;
    unsigned long long field_4a;
    unsigned long long field_4b;
    unsigned long long field_4c;
    unsigned long long field_4d;
    unsigned long long field_4e;
    unsigned long long field_4f;
    unsigned long long field_50;
    unsigned long long field_51;
    unsigned long long field_52;
    unsigned long long field_53;
    unsigned long long field_54;
    unsigned long long field_55;
    unsigned long long field_56;
    unsigned long long field_57;
    unsigned long long field_58;
    unsigned long long field_59;
    unsigned long long field_5a;
    unsigned long long field_5b;
    unsigned long long field_5c;
    unsigned long long field_5d;
    unsigned long long field_5e;
    unsigned long long field_5f;
    unsigned long long field_60;
    unsigned long long field_61;
    unsigned long long field_62;
    unsigned long long field_63;
    unsigned long long field_64;
    unsigned long long field_65;
    unsigned long long field_66;
    unsigned long long field_67;
    unsigned long long field_68;
    unsigned long long field_69;
    unsigned long long field_6a;
    unsigned long long field_6b;
    unsigned long long field_6c;
    unsigned long long field_6d;
    unsigned long long field_6e;
    unsigned long long field_6f;
    unsigned long long field_70;
    unsigned long long field_71;
    unsigned long long field_72;
    unsigned long long field_73;
    unsigned long long field_78;
    unsigned long long field_80;
} st_b4749c_0;


unsigned long long sub_b4749c(st_b4749c_1 *a0)
{
    st_b4749c_0 *v2;  // x20
    unsigned long long v3;  // x8
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    if (a0->field_0 && !sub_a7c17c(a0->field_0))
        return 0;
    if (...)
    {
        v3 = 0;
        while (!*&v2->padding_0[v3 + 128])
        {
            if (v3 == 47)
            {
                v4 = !v2->field_3c;
                if (!a0->field_0)
                    return v4;
                sub_a7c1b4(a0->field_0);
                return v4;
            }
        }
    }
    if (!a0->field_0)
        return 0;
    sub_a7c1b4(a0->field_0);
    return 0;
}
