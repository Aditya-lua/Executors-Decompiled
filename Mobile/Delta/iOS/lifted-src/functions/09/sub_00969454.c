/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969454..0x9694a8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_969454_0 {
    struct st_969454_0 *field_0;
    char padding_8[12];
    struct st_969454_0 *field_14;
} st_969454_0;


st_969454_0 * sub_969454(unsigned long a0, st_969454_0 *a1, st_969454_0 *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_969454_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (*(int *)&(a1->padding_8)[1])
    {
        v8 = sub_95a688();
        if (!v8)
            return (unsigned int)v8;
        if (a2)
            goto LABEL_969480;
    }
    else
    {
        v8 = 0;
        if (a2)
        {
LABEL_969480:
            a2->field_0 = v8;
        }
    }
    return 1;
}
