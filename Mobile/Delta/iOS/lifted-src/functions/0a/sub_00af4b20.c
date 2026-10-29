/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4b20..0xaf4c74 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4b20_1 {
    char padding_0[72];
    struct st_af4b20_2 *field_48;
    char padding_50[72];
    long long field_98;
} st_af4b20_1;

typedef struct st_af4b20_0 {
    char padding_0[232];
    char field_e8;
} st_af4b20_0;

typedef struct st_af4b20_2 {
    unsigned long long field_0;
} st_af4b20_2;


char sub_af4b20(st_af4b20_1 *a0, char a1, long long a2, st_af4b20_0 *a3)
{
    char v2;  // x24
    long long v3;  // x0
    unsigned int v4;  // w0
    char v5;  // x28
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_ad69e4(a2) < 1)
        return 0;
    v2 = 0;
LABEL_af4b80:
    v3 = sub_ad69f8(a2, v2);
    if (a1 && (!(a3->field_e8 >> 5 & 1) || sub_ad69e4(a0->field_98) != 1) && (v4 = sub_ad69e4(a0->field_98), (int)v4 >= 1))
    {
        v5 = 0;
        do
        {
            if (!sub_af1a9c(sub_ad69f8(a0->field_98, v5), v3))
            {
                v2 += 1;
                if ((int)sub_ad69e4(a2) <= v2)
                    return 0;
                goto LABEL_af4b80;
            }
        } while ((v5 += 1, v4 != v5));
    }
    a0->field_48();
}
