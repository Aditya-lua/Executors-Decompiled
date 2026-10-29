/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954824..0x954884 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954824_2 {
    unsigned int field_0;
    char padding_4[20];
    struct st_954824_0 *field_18;
} st_954824_2;

typedef struct st_954824_0 {
    char padding_0[48];
    struct st_954824_1 *field_30;
} st_954824_0;

typedef struct st_954824_1 {
    unsigned long long field_0;
} st_954824_1;


st_954824_2 * sub_954824(st_954824_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x8
    unsigned long long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_0;
    if (!(unsigned int)v8)
    {
LABEL_954858:
        v9 = sub_9709b4();
        if ((unsigned int)v9)
            a0->field_18->field_30();
    }
    else if (!(v8 >> 7 & 1))
    {
        v9 = 0;
    }
    else
    {
        v9 = sub_980dc8(a0);
        if (v9)
            goto LABEL_954858;
    }
    return v9;
}
