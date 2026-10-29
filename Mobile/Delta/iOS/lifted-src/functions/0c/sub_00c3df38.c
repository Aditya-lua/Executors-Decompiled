/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3df38..0xc3dfd0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3df38_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_c3df38_0;

typedef struct st_c3df38_1 {
    char field_0;
    char padding_1[7];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    unsigned int field_18;
} st_c3df38_1;


void sub_c3df38(st_c3df38_1 *a0, st_c3df38_0 *a1)
{
    char v5;  // x8
    unsigned int v6;  // w9
    unsigned long long v7;  // x10
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x3f]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_c3c5c8(&v0);
    if (v0 == 1)
    {
        v5 = v1;
        goto LABEL_c3df70;
    }
    else
    {
        if (a1->field_10 - 1 > v2)
        {
            v6 = a1->field_18 + 1;
            if (v6 <= 500)
            {
                v7 = a1->field_8;
                *(unsigned long long *)&a0->field_0 = a1->field_0;
                *(unsigned long long *)&a0->field_8 = v7;
                a0->field_10 = v2;
                a0->field_18 = v6;
                return;
            }
            v5 = 1;
LABEL_c3df70:
            a0->field_8 = v5;
        }
        else
        {
            a0->field_8 = 0;
        }
        *(unsigned long long *)&a0->field_0 = 0;
        return;
    }
}
