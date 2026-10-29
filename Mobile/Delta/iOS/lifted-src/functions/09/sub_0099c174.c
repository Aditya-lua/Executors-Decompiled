/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c174..0x99c208 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c174_1 {
    int field_0;
    char padding_4[212];
    struct st_99c174_0 *field_d8;
} st_99c174_1;

typedef struct st_99c174_2 {
    char padding_0[24];
    struct st_99c174_1 *field_18;
} st_99c174_2;

typedef struct st_99c174_0 {
    char padding_0[80];
    char field_50;
} st_99c174_0;


char sub_99c174(st_99c174_2 *a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a2)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_18->field_d8->field_50 >> 3 & 1)
    {
        return 1;
    }
    else if (a0->field_18->field_0 < 772)
    {
        return 1;
    }
    else if (a0->field_18->field_0 == 0x10000)
    {
        return 1;
    }
    else if (!*(int *)&a0[40].padding_0[8])
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions.c", 1292, "final_sig_algs");
        sub_9a58a4(a0, 109, 112, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
