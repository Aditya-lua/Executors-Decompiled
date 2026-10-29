/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b32c..0xa9b3d0 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9b32c_0 {
    char padding_0[8];
    struct st_a9b32c_1 *field_8;
} st_a9b32c_0;

typedef struct st_a9b32c_1 {
    long long field_0;
} st_a9b32c_1;


unsigned long long * sub_a9b32c(st_a9b32c_0 *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8)
    {
        sub_a368c8();
        sub_a369bc("crypto/ocsp/ocsp_cl.c", 130, "OCSP_response_get1_basic");
        v2 = 108;
    }
    else if (sub_a99eac(*(long long *)a0->field_8) == 365)
    {
        sub_a9b2fc();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ocsp/ocsp_cl.c", 134, "OCSP_response_get1_basic");
        v2 = 104;
    }
    sub_a36abc(39, v2, 0);
    return 0;
}
