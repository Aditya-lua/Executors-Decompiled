/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2842a4..0x2843b0 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2842a4_8 {
    char padding_0[136];
    unsigned long long field_88;
} st_2842a4_8;

typedef struct st_2842a4_1 {
    char padding_0[104];
    struct st_2842a4_1 *field_68;
    char padding_70[1552];
    unsigned int field_680;
    char padding_684[136];
    unsigned int field_70c;
} st_2842a4_1;

typedef struct st_2842a4_4 {
    char padding_0[2];
    struct st_2842a4_1 *field_2;
    struct st_2842a4_3 *field_8;
} st_2842a4_4;

typedef struct st_2842a4_3 {
    char padding_0[24];
    struct st_2842a4_2 *field_18;
} st_2842a4_3;

typedef struct st_2842a4_5 {
    char padding_0[40];
    struct st_2842a4_4 *field_28;
} st_2842a4_5;

typedef struct st_2842a4_2 {
    char padding_0[48];
    unsigned long long field_30;
} st_2842a4_2;

typedef struct st_2842a4_0 {
    char field_0;
} st_2842a4_0;

typedef struct st_2842a4_6 {
    char padding_0[1408];
    unsigned long long field_580;
} st_2842a4_6;

typedef struct st_2842a4_7 {
    char padding_0[96];
    struct st_2842a4_6 *field_60;
} st_2842a4_7;

extern st_2842a4_7 *g_f0d198;

void sub_2842a4(unsigned long long *a0, st_2842a4_8 *a1, unsigned long a2, unsigned long a3, st_2842a4_5 **a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_2842a4_1 *v14;  // x9
    st_2842a4_1 *v15;  // x9
    st_2842a4_1 *v16;  // x19
    unsigned int v18;  // w9
    st_2842a4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2842a4_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    if (*(long long *)(*(long long *)&*a4->field_28->field_2->padding_0[24] + 48) == g_f0d198->field_60->field_580 && (char)(*a4->field_28->padding_0)[1] < 0)
    {
        v14 = a2 + (a1->field_88 >> 1);
        do
        {
            v15 = v14;
            v16 = v15;
            v14 = v15->field_68;
        } while (v15->field_68);
        if (v16->field_70c < 105)
            v18 = 105;
        else
            v18 = v16->field_70c + 1;
        v16->field_680 = 1;
        v16->field_70c = v18;
        a0();
    }
    a0();
}
