/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc09148..0xc093f0 (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c09148_2 {
    char padding_0[8];
    struct st_c09148_0 *field_8;
} st_c09148_2;

typedef struct st_c09148_0 {
    char padding_0[24];
    struct st_c09148_1 *field_18;
} st_c09148_0;

typedef struct st_c09148_1 {
    unsigned long long field_0;
} st_c09148_1;


void sub_c09148(char *a0, st_c09148_2 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x8
    unsigned long v13;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = *a0;
    while (1)
    {
        if (v12 & 1)
            a1->field_8->field_18();
        /* unsupported instruction */;
        v13 = /* unsupported instruction */;
        /* unsupported instruction */;
        if ((unsigned int)v13 == (unsigned int)v12)
        {
            /* unsupported instruction */;
            v12 = v13;
            if (!(/* unsupported instruction */ ^ 1))
                a1->field_8->field_18();
        }
        else
        {
            /* unsupported instruction */;
            v12 = v13;
        }
    }
}
