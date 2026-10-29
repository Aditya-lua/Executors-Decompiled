/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb369cc..0xb36aec (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b369cc_1 {
    struct st_b369cc_0 *field_0;
    struct st_b369cc_0 *field_8;
    char padding_10[20];
    unsigned int field_24;
    char padding_28[16];
    unsigned long long field_38;
    struct st_b369cc_0 *field_40;
} st_b369cc_1;

typedef struct st_b369cc_0 {
    char padding_0[80];
    struct st_b369cc_0 *field_50;
    unsigned long long field_58;
    struct st_b369cc_0 *field_60;
} st_b369cc_0;


st_b369cc_0 * sub_b369cc(st_b369cc_1 *a0, unsigned int a1, st_b369cc_0 *a2, st_b369cc_0 *a3, unsigned long a4)
{
    st_b369cc_0 *v2;  // x0
    st_b369cc_0 *v3;  // x0
    st_b369cc_0 *v4;  // x0
    st_b369cc_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (a1 == 0x2000 && !a2->field_50)
        return 0;
    sub_a2a8a4(a0->field_0);
    a0->field_0 = 0;
    v3 = sub_a646b8();
    a0->field_40 = v3;
    if (!v3)
        return 0xfffffffe;
    a0->field_38 = "HKDF";
    v4 = sub_a2a930(a2);
    if (!(unsigned int)v4)
        return v4;
    a0->field_0 = a2;
    if (a3)
    {
        if ((int)a3->field_60 != (int)a2->field_60)
            return 0;
        if (a3->field_58 != a2->field_58)
            return 0;
        if (a1 == 0x1000 && !a3->field_50)
            return 0;
        sub_a2a8a4(a0->field_8);
        a0->field_8 = 0;
        v5 = sub_a2a930(a3);
        if (!(unsigned int)v5)
            return v5;
        a0->field_8 = a3;
    }
    a0->field_24 = a1;
}
