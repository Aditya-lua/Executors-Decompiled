/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0ffc..0x9c1048 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c0ffc_0 {
    char padding_0[4];
    unsigned int field_4;
} st_9c0ffc_0;


unsigned long long sub_9c0ffc(st_9c0ffc_0 *a0, st_9c0ffc_0 *a1)
{
    unsigned int v2;  // w19
    unsigned int v3;  // w0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_4 & 0x100;
    if (v2 == (a1->field_4 & 0x100))
    {
        v3 = sub_9c7af8();
        if (!v2)
            v4 = v3;
        else
            v4 = -v3;
        return v4;
    }
    else if (!v2)
    {
        return 1;
    }
    else
    {
        return 0xfffffffe;
    }
}
