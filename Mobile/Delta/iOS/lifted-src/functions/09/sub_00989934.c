/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989934..0x989a10 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989934_0 {
    char padding_0[72];
    unsigned long long field_48;
    char padding_50[24];
    unsigned long long field_68;
    long long field_70;
    char padding_78[8];
    char field_80;
    char padding_81[127];
    unsigned long long field_100;
} st_989934_0;

typedef struct st_989934_1 {
    char padding_0[88];
    unsigned long long field_58;
} st_989934_1;

extern char g_1000000;

unsigned long long sub_989934(st_989934_1 *a0, st_989934_0 *a1, unsigned long a2)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // w9
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a1->field_100;
    v8 = ((unsigned int)v7 * &g_1000000 | (unsigned int)v7 >> 8) & 0xff0000ff & 0xff;
    if (4 >= v8)
    {
        v0 = v9;
        v1 = v10;
        v2 = v11;
        v3 = v12;
        v4 = &v6;
        v5 = v13;
        if (v8 != 1)
        {
            if (v8 == 2)
                goto LABEL_9899a0;
            if (v8 != 3)
                return 0;
        }
        else
        {
            a1->field_100 = v7 & 0xffffffffffff00ff | 0x200;
LABEL_9899a0:
            a1->field_68 = sub_c4c40(&a1->field_80);
            v7 = a1->field_100;
        }
        a1->field_48 = a2;
        a1->field_100 = v7 & 0xffffffffffff01ff | 0x800000500;
        sub_988ae8(a1->field_70);
        a1->field_70 = 0;
        if (a1->field_100 >> 39 & 1)
        {
            a1->field_100 = a1->field_100 & 0xffffff7fffffffff;
            a0->field_58 = a0->field_58 - 1;
        }
        sub_98959c(a0, a1);
        return 1;
    }
    else if (v8 - 5 < 2)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
