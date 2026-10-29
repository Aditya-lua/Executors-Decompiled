/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6186c..0xc618f8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6186c_0 {
    char padding_0[104];
    struct st_c6186c_0 *field_68;
    char padding_70[24];
    unsigned long long field_88;
    unsigned long long field_90;
    char padding_98[92];
    struct st_c6186c_0 *field_f4;
} st_c6186c_0;


void sub_c6186c(st_c6186c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (!(int)a0->field_68)
        return;
    sub_973bbc(sub_973bd4(), "time");
    if (*(int *)&(a0->padding_98)[1])
    {
        sub_973be4();
        a0->field_90 = a0->field_88;
    }
    else
    {
        sub_973be4();
        a0->field_90 = a0->field_88;
        *(unsigned int *)&(a0->padding_98)[1] = 1;
    }
    sub_973bd4();
    *(unsigned int *)&a0->field_68 = 0;
    return;
}
