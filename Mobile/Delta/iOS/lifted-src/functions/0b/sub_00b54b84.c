/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54b84..0xb54c14 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54b84_0 {
    unsigned long long field_0;
    char padding_8[8];
    struct st_b54b84_0 *field_10;
    struct st_b54b84_0 *field_18;
} st_b54b84_0;


int sub_b54b84(unsigned long a0)
{
    st_b54b84_0 *v2;  // x0
    st_b54b84_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afd760();
    if (v2)
    {
        v3 = v2;
        v2 = sub_a6bffc(72, "providers/implementations/storemgmt/file_store.c", 130);
        if (v2)
        {
            *(unsigned int *)&v2->field_10 = 0;
            v2->field_0 = a0;
            v2->field_18 = v3;
        }
        else
        {
            sub_a368c8(sub_b55578());
            sub_a369bc("providers/implementations/storemgmt/file_store.c", 159, "file_open_stream");
            sub_a36abc(57, 0x80039, 0);
            sub_9d3c28(v3);
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
