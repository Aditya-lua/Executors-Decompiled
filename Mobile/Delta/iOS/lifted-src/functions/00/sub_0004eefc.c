/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4eefc..0x4f01c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4eefc_3 {
    char padding_0[48];
    struct st_4eefc_1 *field_30;
    unsigned long long field_38;
    struct st_4eefc_2 *field_40;
} st_4eefc_3;

typedef struct st_4eefc_1 {
    unsigned long long field_0;
} st_4eefc_1;

typedef struct st_4eefc_2 {
    struct st_4eefc_1 *field_0;
} st_4eefc_2;

typedef struct st_4eefc_0 {
    char field_0;
} st_4eefc_0;


void sub_4eefc(unsigned long long *a0, st_4eefc_3 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long i;  // x22
    unsigned long long v15;  // x0
    unsigned long long v16;  // x8
    st_4eefc_2 **v17;  // x0
    st_4eefc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4eefc_0 *v1;  // [bp-0x38]
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
    if (a1->field_38)
    {
        i = 0;
        do
        {
            v15 = sub_4f204(a0, *(long long *)&a1->field_30[i]);
            v16 = v15 + a0[8];
            a0[8] = (v16 & 0x8080808080808080) - ((v16 & 0x8080808080808080) >> 7) | v16 & 0x7f7f7f7f7f7f7f7f;
            a0[9] = 0;
            i += 1;
        } while (i < a1->field_38);
    }
    v17 = a1->field_40;
    a0[8] = 0;
    a0[9] = 0;
    (*(long long *)*v17)();
}
