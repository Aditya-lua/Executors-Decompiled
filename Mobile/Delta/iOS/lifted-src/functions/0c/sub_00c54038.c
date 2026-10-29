/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54038..0xc541a8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c54038_0 {
    long long field_0;
    char padding_8[512];
    long long field_208;
    long long field_210;
    unsigned long long field_218;
    long long *field_220;
    unsigned long long field_228;
    unsigned long long field_230;
    long long *field_238;
    unsigned long long field_240;
} st_c54038_0;


unsigned long long sub_c54038(unsigned long long a0, unsigned long long a1)
{
    unsigned long long i;  // x25
    unsigned long long v3;  // x0
    st_c54038_0 *v4;  // x22
    unsigned long long v5;  // x28
    unsigned long long *v6;  // x26
    unsigned long long v7;  // x28
    unsigned long long j;  // x28
    unsigned long long *v9;  // x26
    unsigned long long v10;  // x28
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return a0;
    i = 0;
    v3 = a0;
    do
    {
        v4 = a0 + 584 * i;
        i += 1;
        if (v4->field_0 >= -9223372036854775806)
        {
            sub_c48fb0(v4);
            v3 = _munmap(v4->field_208, v4->field_210);
            v5 = v4->field_228;
            if (v4->field_228)
            {
                v6 = v4->field_220 + 1;
                do
                {
                    v7 = v5;
                    if (*(long long *)((char *)v6 - 8))
                        v3 = _free(*v6);
                } while ((v6 += 3, v5 = v7 - 1, v7 != 1));
            }
            if (v4->field_218)
                v3 = _free(v4->field_220);
            j = v4->field_240;
            if (v4->field_240)
            {
                v9 = v4->field_238 + 1;
                do
                {
                    v10 = j;
                    v3 = _munmap(*(long long *)((char *)v9 - 8), *v9);
                    v9 += 2;
                    j = v10 - 1;
                } while (j);
            }
            if (v4->field_230)
                v3 = _free(v4->field_238);
        }
    } while (i != a1);
    return v3;
}
