/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e1a4..0xa6e200 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e1a4_0 {
    char field_0;
} st_a6e1a4_0;


char * sub_a6e1a4(unsigned long a0, st_a6e1a4_0 **a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a6e1a4_0 **iter;  // x19
    char *msg;  // x0
    char *v10;  // x8
    char *v11;  // x8
    char *v12;  // w9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (2 > a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    iter = a1;
    msg = _strerror();
    if (msg)
    {
        v10 = a2 - 1;
        do
        {
            v11 = v10;
            v12 = (char *)*msg;
        } while (v12 && (msg += 1, *(char *)iter = (char)v12, iter = (char *)iter + 1, v10 = v11 - 1, v11 != 1));
        *(char *)iter = 0;
        msg = 1;
    }
    return (unsigned int)msg;
}
