/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7ade4..0xb7b10c (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7ade4_4 {
    char padding_0[8];
    struct st_b7ade4_1 *field_8;
} st_b7ade4_4;

typedef struct st_b7ade4_1 {
    char padding_0[24];
    struct st_b7ade4_0 *field_18;
} st_b7ade4_1;

typedef struct st_b7ade4_0 {
    char padding_0[56];
    unsigned long long field_38;
} st_b7ade4_0;


void sub_b7ade4(st_b7ade4_4 **a0, st_b7ade4_1 *a1)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    st_b7ade4_0 *v24;  // x25
    unsigned long long *v25;  // x8
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = a1->field_18;
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b7b050;
        v25 = *a0->field_8->field_18;
        if (!v24->field_38)
            goto LABEL_b7b06c;
    }
    else
    {
        /* unsupported instruction */;
LABEL_b7b050:
        sub_c7573c(&v24->padding_0[8]);
        v25 = *a0->field_8->field_18;
        if (!v24->field_38)
        {
LABEL_b7b06c:
            v25();
        }
    }
    v25();
}
