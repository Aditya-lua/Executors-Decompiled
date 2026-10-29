/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b5f4..0xa9b6b4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9b5f4_0 {
    struct st_a9b5f4_0 *field_0;
} st_a9b5f4_0;


st_a9b5f4_0 ** sub_a9b5f4(st_a9b5f4_0 **a0, long long *a1, long long a2)
{
    st_a9b5f4_0 **v2;  // x19
    st_a9b5f4_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && !(v2 = *a0, !*a0) || (v3 = sub_9cf0ec(), v2 = v3, v3))
    {
        v3 = sub_9c026c(v2, *a1, a2);
        if (!(unsigned int)v3)
            goto LABEL_a9b654;
        *a1 = *a1 + a2;
        if (a0)
            *a0 = v2;
    }
    else
    {
LABEL_a9b654:
        if (!a0 || *a0 != v2)
            v3 = sub_9cf0f4(v2);
        sub_a368c8(v3);
        sub_a369bc("crypto/ocsp/v3_ocsp.c", 176, "d2i_ocsp_nonce");
        sub_a36abc(39, 0x8000d, 0);
        v2 = 0;
    }
    return v2;
}
