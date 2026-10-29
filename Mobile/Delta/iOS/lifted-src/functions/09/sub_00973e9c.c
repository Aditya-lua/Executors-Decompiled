/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x973e9c..0x973f68 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_973e9c_0 {
    long long field_0;
    char padding_8[112];
    char field_78;
} st_973e9c_0;


void sub_973e9c(long long a0, st_973e9c_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_c61590())
        return;
    sub_973a30(a0, "header");
    sub_973a98(a0, "packet_type");
    if ((a1->field_78 & 253) != 4)
        sub_973b10(a0, "packet_number", a1->field_0);
    sub_973a5c(a0);
}
