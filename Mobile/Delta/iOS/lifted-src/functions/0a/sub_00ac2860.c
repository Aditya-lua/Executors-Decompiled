/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2860..0xac290c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2860_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    unsigned int field_34;
} st_ac2860_0;


int sub_ac2860(st_ac2860_0 *a0, unsigned long long *a1, unsigned int a2, unsigned int a3)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x8
    unsigned int v2;  // w9

    v0 = *a1;
    v1 = a1[1];
    v2 = a0->field_2c;
    if (!a0->field_2c)
        v2 = 16;
    if (!a3)
        a3 = 4;
    if (!a2)
        a2 = 2;
    a0->field_30 = a2;
    a0->field_34 = a3;
    a0->field_28 = 0;
    a0->field_2c = v2;
    a0->field_0 = 0;
    a0->field_8 = v0 ^ 8317987319222330741;
    a0->field_10 = v1 ^ 7237128888997146477;
    a0->field_18 = v0 ^ 7816392313619706465;
    a0->field_20 = v1 ^ 8387220255154660723;
    if (v2 == 16)
        a0->field_10 = v1 ^ 7237128888997146499;
    return 1;
}
