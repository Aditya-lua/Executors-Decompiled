/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b1a4..0x97b310 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b1a4_0 {
    struct st_97b1a4_0 *field_0;
    struct st_97b1a4_0 *field_8;
    char padding_10[48];
    struct st_97b1a4_0 *field_40;
    struct st_97b1a4_0 *field_48;
    unsigned long long field_50;
    struct st_97b1a4_0 *field_58;
    struct st_97b1a4_0 *field_60;
    unsigned long long field_68;
} st_97b1a4_0;


void sub_97b1a4(st_97b1a4_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_97b1a4_0 *v17;  // x0
    st_97b1a4_0 *v18;  // x21
    st_97b1a4_0 *v19;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_97b1a4_0 *v12;  // x8
    st_97b1a4_0 *v13;  // x0
    st_97b1a4_0 *v14;  // x21
    st_97b1a4_0 *v15;  // x8
    st_97b1a4_0 *v16;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_40;
    if (v12)
    {
        v13 = v12;
        while (1)
        {
            v14 = v13->field_0;
            if (v12 == v13)
                a0->field_40 = v14;
            v15 = v13->field_8;
            if (a0->field_48 == v13)
            {
                a0->field_48 = v15;
                if (v15)
                {
LABEL_97b1f4:
                    v15->field_0 = v14;
                }
            }
            else if (!(!v15))
            {
                goto LABEL_97b1f4;
            }
            if (!v14)
                break;
            v14->field_8 = v15;
            a0->field_50 = a0->field_50 - 1;
            v13->field_0 = 0;
            v13->field_8 = 0;
            sub_a6c2e4();
            v12 = a0->field_40;
            v13 = v14;
        }
        a0->field_50 = a0->field_50 - 1;
        v13->field_0 = 0;
        v13->field_8 = 0;
        sub_a6c2e4();
    }
    v16 = a0->field_58;
    if (v16)
    {
        v17 = v16;
        while (1)
        {
            v18 = v17->field_0;
            if (v16 == v17)
                a0->field_58 = v18;
            v19 = v17->field_8;
            if (a0->field_60 == v17)
            {
                a0->field_60 = v19;
                if (v19)
                {
LABEL_97b28c:
                    v19->field_0 = v18;
                }
            }
            else if (!(!v19))
            {
                goto LABEL_97b28c;
            }
            if (!v18)
                break;
            v18->field_8 = v19;
            a0->field_68 = a0->field_68 - 1;
            v17->field_0 = 0;
            v17->field_8 = 0;
            sub_a6c2e4();
            v16 = a0->field_58;
            v17 = v18;
        }
        a0->field_68 = a0->field_68 - 1;
        v17->field_0 = 0;
        v17->field_8 = 0;
        sub_a6c2e4();
    }
    sub_a6c2e4();
    return;
}
