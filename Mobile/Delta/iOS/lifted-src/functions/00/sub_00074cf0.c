/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74cf0..0x74d58 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74cf0_1 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[15];
    unsigned long long field_18;
    char field_20;
} st_74cf0_1;

typedef struct st_74cf0_2 {
    char padding_0[56];
    unsigned long long field_38;
} st_74cf0_2;

typedef struct st_74cf0_0 {
    char field_0;
} st_74cf0_0;


st_74cf0_2 * sub_74cf0(st_74cf0_2 *a0, st_74cf0_1 *a1)
{
    unsigned long long i;  // x8
    char *v3;  // x11
    st_74cf0_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_74cf0_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_8 != 1)
    {
        return a0;
    }
    else if (a1->field_18)
    {
        i = 0;
        do
        {
            v3 = a0->field_38 + a1->field_0;
            v3[i] = v3[i] ^ (&a1->field_20)[i & 3];
            i += 1;
        } while (i != a1->field_18);
        return a0;
    }
    else
    {
        return a0;
    }
}
