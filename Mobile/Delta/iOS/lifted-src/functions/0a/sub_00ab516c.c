/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab516c..0xab51e0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab516c_0 {
    char padding_0[32];
    long long field_20;
} st_ab516c_0;


int sub_ab516c(long long *a0)
{
    unsigned long long v2;  // x20
    st_ab516c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)sub_ad69e4(a0[0x11]) >= 1)
    {
        v2 = 0;
        do
        {
            v3 = sub_ad69f8(a0[0x11], v2);
            sub_9e6c64(v3->field_20);
            v2 = (unsigned int)v2 + 1;
        } while ((int)v2 < (int)sub_ad69e4(a0[0x11]));
    }
    sub_9e6c64(a0[21]);
    sub_9e6c64(a0[22]);
    sub_9e6c64(a0[23]);
    return 1;
}
