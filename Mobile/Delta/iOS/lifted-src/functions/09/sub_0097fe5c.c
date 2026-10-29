/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97fe5c..0x97ff2c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97fe5c_1 {
    char padding_0[128];
    struct st_97fe5c_0 *field_80;
} st_97fe5c_1;

typedef struct st_97fe5c_0 {
    char padding_0[112];
    long long field_70;
} st_97fe5c_0;

extern unsigned long long g_600000;

unsigned long long sub_97fe5c(st_97fe5c_1 *a0, unsigned long a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x24
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // x23
    unsigned long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_c4ba8(a0->field_80->field_70);
    v4 = sub_c4ba8(&a0->field_80[1].padding_0[8]);
    v5 = v4 - v3;
    if (v4 < v3)
        v5 = 0;
    if (v5 >= v2)
        v5 = v2;
    v6 = sub_c4c40();
    if (v5 > sub_989074(a0->field_80->field_70) && v6 != &g_600000)
    {
        v8 = sub_989068();
        if (!(unsigned int)v8)
            return v8;
    }
}
