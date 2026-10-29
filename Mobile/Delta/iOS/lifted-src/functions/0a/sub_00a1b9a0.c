/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b9a0..0xa1ba90 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b9a0_1 {
    struct st_a1b9a0_0 *field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[120];
    long long field_90;
} st_a1b9a0_1;

typedef struct st_a1b9a0_0 {
    char padding_0[400];
    long long field_190;
} st_a1b9a0_0;


long long sub_a1b9a0(st_a1b9a0_1 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    long long v19;  // x23
    long long v20;  // x21
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x19
    long long v17;  // x20
    long long v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a0->field_0->field_190)
    {
        goto *((void *)(a0->field_0->field_190));
    }
    else
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = v13;
        v5 = v14;
        v6 = &v8;
        v7 = v15;
        if (!a0->field_90)
            return 0;
        if (a3)
        {
            v16 = 0;
        }
        else
        {
            a3 = sub_9dde94();
            v16 = a3;
            if (!v16)
                return 0;
        }
        sub_9de064(a3);
        v17 = a3;
        v18 = sub_9de208(v17);
        if (v18 && !(v19 = v18, !sub_9e4d58() || !sub_9db58c(v19, a0->field_10, v19)))
            v20 = sub_9dfcdc(a1, a2, v19, a0->field_10, v17, a0->field_90) != 0;
        else
            v20 = 0;
        sub_9de17c(v17);
        sub_9dded4(v16);
        return v20;
    }
}
