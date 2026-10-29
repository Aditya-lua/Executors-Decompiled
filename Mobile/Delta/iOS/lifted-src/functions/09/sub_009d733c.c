/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d733c..0x9d7378 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d733c_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_9d733c_0;


int sub_9d733c(st_9d733c_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(0x100, "crypto/bio/bss_dgram.c", 275);
    if (v2)
    {
        a0->field_40 = v2;
        v2 = 1;
    }
    return v2;
}
