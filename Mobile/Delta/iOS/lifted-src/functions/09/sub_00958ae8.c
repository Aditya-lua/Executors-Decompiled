/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958ae8..0x958b78 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958ae8_1 {
    struct st_958ae8_0 *field_0;
    struct st_958ae8_0 *field_8;
} st_958ae8_1;

typedef struct st_958ae8_0 {
    struct st_958ae8_1 *field_0;
    char padding_8[24];
    unsigned long long field_20;
    struct st_958ae8_0 *field_28;
} st_958ae8_0;


char * sub_958ae8(char *a0, char *a1)
{
    char *v0;  // x9
    char *v1;  // x8
    char *v2;  // x8
    st_958ae8_1 *v3;  // x9
    char *v4;  // x8

    if (a0)
    {
        if (a1 == 2)
        {
            v1 = *(long long *)&a0[40];
            v0 = 1 + 14757395258967641293 * (*(long long *)a0 - *(long long *)&a0[32] >> 3);
            if ((unsigned long long)*(long long *)&a0[40] > v0)
                goto LABEL_958b30;
        }
        else if (a1 == 1)
        {
            v0 = 0;
            v1 = *(long long *)&a0[40];
LABEL_958b30:
            v2 = v1 - v0;
            if (v1 > v0)
            {
                v3 = *(long long *)&a0[32] + 40 * v0;
                do
                {
                    v4 = v2;
                    if (v3->field_0 && v3->field_8)
                    {
                        *(st_958ae8_1 **)a0 = v3;
                        return 1;
                    }
                } while ((v3 = &v3[2].field_8, v2 = v4 - 1, v4 != 1));
            }
        }
        a0 = 0;
    }
    return (unsigned int)a0;
}
