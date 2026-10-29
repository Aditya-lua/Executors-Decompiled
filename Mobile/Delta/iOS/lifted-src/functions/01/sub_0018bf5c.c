/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bf5c..0x18bff4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02128;
extern unsigned short g_f0212a;
extern unsigned short g_f0212c;
extern unsigned short g_f0212e;
extern unsigned long long g_f02238;
extern unsigned short g_f10060;
extern unsigned short g_f10062;
extern unsigned short g_f10064;
extern unsigned short g_f10066;

long long sub_18bf5c(void)
{
    unsigned long v0;  // x0

    g_f10060 = 4416;
    g_f10062 = 10834;
    g_f10064 = 53131;
    g_f10066 = 18140;
    g_f02128 = g_f10060 ^ g_f02128;
    g_f0212a = g_f10062 ^ g_f0212a;
    g_f0212c = g_f10064 ^ g_f0212c;
    g_f0212e = g_f10066 ^ g_f0212e;
    g_f02238 = g_f02238 ^ 5106184274148725056;
    return v0;
}
