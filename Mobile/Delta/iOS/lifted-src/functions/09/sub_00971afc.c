/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971afc..0x971c5c (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971afc_0 {
    struct st_971afc_1 *field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[8];
    unsigned long long field_58;
    char padding_60[8];
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[4];
    struct st_971afc_1 *field_78;
    struct st_971afc_1 *field_80;
    struct st_971afc_1 *field_88;
    struct st_971afc_1 *field_90;
    struct st_971afc_2 *field_98;
} st_971afc_0;

typedef struct st_971afc_2 {
    unsigned int field_0;
} st_971afc_2;

typedef struct st_971afc_1 {
    unsigned long long field_0;
} st_971afc_1;


void sub_971afc(st_971afc_0 *a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*(int *)&a0->padding_60[0])
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_68 > a0->field_58)
    {
        a0->field_70 = 1;
        a0->field_0();
    }
    if (a1 & 1)
    {
        a0->field_40 = a0->field_18;
        a0->field_58 = 0;
    }
    *(unsigned int *)&a0->padding_60[0] = 0;
    if (a0->field_78)
        *(unsigned long long *)a0->field_78 = a0->field_30;
    if (a0->field_80)
        *(unsigned long long *)a0->field_80 = a0->field_40;
    if (a0->field_88)
        *(unsigned long long *)a0->field_88 = a0->field_18;
    if (a0->field_90)
        *(unsigned long long *)a0->field_90 = a0->field_38;
    if (!a0->field_98)
        return;
    if (a0->field_70)
    {
        v8 = 82;
    }
    else if (a0->field_40 < a0->field_48)
    {
        v8 = 83;
    }
    else
    {
        v8 = 65;
    }
LABEL_971c4c:
    *(unsigned int *)a0->field_98 = v8;
    goto LABEL_971c4c;
    return;
}
