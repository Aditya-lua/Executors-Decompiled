/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9628c4..0x962918 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9628c4_0 {
    unsigned int field_0;
    char padding_4[108];
    unsigned long long field_70;
} st_9628c4_0;


unsigned int sub_9628c4(st_9628c4_0 **a0)
{
    st_9628c4_0 *v2;  // x19
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!v2)
        return 0xffffffff;
    v3 = v2->field_0;
    if ((unsigned int)v3)
    {
        if (v3 >> 7 & 1)
        {
            v2 = sub_980dc8(v2);
            if (!v2)
                return 0xffffffff;
        }
        else
        {
            return 0xffffffff;
        }
    }
    goto *((void *)(v2->field_70));
}
