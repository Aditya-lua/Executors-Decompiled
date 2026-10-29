/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdaea8..0xbdb228 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdaea8_4 {
    char padding_0[8];
    struct st_bdaea8_2 *field_8;
} st_bdaea8_4;

typedef struct st_bdaea8_2 {
    char padding_0[24];
    struct st_bdaea8_3 *field_18;
} st_bdaea8_2;

typedef struct st_bdaea8_3 {
    unsigned long long field_0;
} st_bdaea8_3;

typedef struct st_bdaea8_1 {
    struct st_bdaea8_0 *field_0;
} st_bdaea8_1;

typedef struct st_bdaea8_0 {
    char padding_0[8];
    char field_8;
} st_bdaea8_0;


void sub_bdaea8(st_bdaea8_1 **a0, st_bdaea8_4 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x8
    unsigned long v17;  // x9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *(char *)(*(long long *)*a0 + 8);
    while (1)
    {
        if (v16 & 1)
            a1->field_8->field_18();
        /* unsupported instruction */;
        v17 = /* unsupported instruction */;
        /* unsupported instruction */;
        if ((unsigned int)v17 == (unsigned int)v16)
        {
            /* unsupported instruction */;
            v16 = v17;
            if (!(/* unsupported instruction */ ^ 1))
                a1->field_8->field_18();
        }
        else
        {
            /* unsupported instruction */;
            v16 = v17;
        }
    }
}
