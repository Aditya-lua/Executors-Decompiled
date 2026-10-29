/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb64f30..0xb64fe4 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b64f30_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_b64f30_0;

typedef struct st_b64f30_1 {
    char padding_0[56];
    struct st_b64f30_0 *field_38;
    char padding_40[8];
    struct st_b64f30_2 *field_48;
} st_b64f30_1;

typedef struct st_b64f30_2 {
    unsigned long long field_0;
} st_b64f30_2;


unsigned int sub_b64f30(st_b64f30_1 *a0)
{
    st_b64f30_0 *v0;  // [bp-0x28]
    unsigned int v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (sub_b611f4(a0))
    {
        v1 = 0xfffffffe;
        return v1;
    }
    v0 = a0->field_38;
    if (!v0->field_48)
        a0->field_48();
    a0->field_48();
}
